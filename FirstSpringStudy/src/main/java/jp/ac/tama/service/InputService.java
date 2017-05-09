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
        // Scanner で入力した文字列を取得する
        Scanner scanner = new Scanner(inputStream);
        System.out.println("Please input left side number.");
        // 取得した文字列を int型 の left に追加する
        int left = scanner.nextInt();

        // 上と同じ
        System.out.println("Please input right side number.");
        int right = scanner.nextInt();
        InputResult inputResult = new InputResult(right,left);
        return inputResult;

    }
}