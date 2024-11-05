package kafka.consume;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

	@KafkaListener(topics = "test5",groupId = "group_id")
	public void consume(String message) {
		System.out.println("from kafka = "+message); 
	}
}
