package jp.ac.tama.service;

/**
 * Created by YK on 2017/05/09.
 */
import jp.ac.tama.model.InputResult;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Scanner;

@Service
public class InputService {
    public InputResult ScanInput(InputStream inputStream){
        Scanner scanner = new Scanner(inputStream);
        System.out.println("Please input left side number.");
        int left = scanner.nextInt();
        System.out.println("Please input right side number.");
        int right = scanner.nextInt();
        InputResult inputResult = new InputResult(right,left);
        return inputResult;

    }
}