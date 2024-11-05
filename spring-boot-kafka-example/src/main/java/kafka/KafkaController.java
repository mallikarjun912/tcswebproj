package kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

	@Autowired
	KafkaSender sender;
	
	@GetMapping("/{mesg}")
	public String producer(@PathVariable String mesg) {
		sender.send(mesg);
		return "Message sent to kakfa ";
		
	}
}
