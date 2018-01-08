package graph.upload;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import graph.upload.storage.StorageProperties;
import graph.upload.storage.StorageService;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class GraphDisplayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphDisplayApplication.class);
	}

	/**
	 * アプリケーション起動時に自動実行されるます。
	 * ファイル格納先ディレクトリおよび、ファイルを削除し、ファイルの格納先を新たに作成します。
	 * @param storageService
	 * @return
	 */
	@Bean
	CommandLineRunner init(StorageService storageService) {
	    return (args) -> {
	        storageService.deleteAll();
	        storageService.init();
	    };
	}
}
