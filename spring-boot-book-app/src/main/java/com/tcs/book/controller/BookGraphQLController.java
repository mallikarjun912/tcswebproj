package com.tcs.book.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.book.entity.Book;
import com.tcs.book.service.BookService;

import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.schema.DataFetcher;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;

@RestController
@RequestMapping("/bookgraphql")
public class BookGraphQLController {
	@Autowired
	BookService service;
	// Using GraphQL configuration

	@Value("classpath:book.graphqls")
	private Resource schemaResource;

	private GraphQL graphQL;

	@PostConstruct // to load graphqls schema file from resources
	public void loadSchema() throws IOException {
		File file = schemaResource.getFile();
		TypeDefinitionRegistry registry = new SchemaParser().parse(file);
		RuntimeWiring wiring = buildWiring();
		GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(registry, wiring);
		graphQL = GraphQL.newGraphQL(schema).build();

	}

	private RuntimeWiring buildWiring() {
		DataFetcher<List<Book>> fetcher1 = data -> {
			return service.getAllBooks();
		};
		DataFetcher<Book> fetcher2 = data -> {
			Book book = service.getBookById(data.getArgument("bookId"));
			return book;
		};

		return RuntimeWiring.newRuntimeWiring().type("Query",
				typeWriting -> typeWriting.dataFetcher("getAllBooks", fetcher1).dataFetcher("findBook", fetcher2))
				.build();
	}

	// End of GraphQL configuration
	// Graph QL api setup
	@PostMapping("/getall")
	public ResponseEntity<Object> getAllBooksUsingGraphQL(@RequestBody String query) {
		ExecutionResult result = graphQL.execute(query);
		return new ResponseEntity<Object>(result, HttpStatus.OK);
	}

	@PostMapping("/getbyid")
	public ResponseEntity<Object> getBookByIdUsingGraphQL(@RequestBody String query) {
		ExecutionResult result = graphQL.execute(query);
		return new ResponseEntity<Object>(result, HttpStatus.OK);
	}
}
