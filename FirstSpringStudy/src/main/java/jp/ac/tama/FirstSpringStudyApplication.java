package jp.ac.tama;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jp.ac.tama.service.InputService;
import lombok.val;

@SpringBootApplication
public class FirstSpringStudyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringStudyApplication.class, args);
	}

	@Autowired
	InputService inputService;

	@Override
	public void run(String... args) throws Exception {
		// InputService の ScanInput を呼び出し、その結果を result に入れて表示してる
		val result = inputService.ScanInput(System.in);
		System.out.println(result);
	}
}