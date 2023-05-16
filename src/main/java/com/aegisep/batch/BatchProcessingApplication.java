package com.aegisep.batch;

import com.aegisep.batch.utils.BatchShutdownHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableBatchProcessing
@SpringBootApplication
@Slf4j
public class BatchProcessingApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BatchProcessingApplication.class, args);

		BatchShutdownHandler batchShutdownHandler = new BatchShutdownHandler();
		SpringApplication.getShutdownHandlers().add(batchShutdownHandler);
	}

}

