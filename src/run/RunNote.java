package run;

import notebook.NotePad;
import java.util.Scanner;

public class RunNote {
    private final NotePad notePad;
    Scanner scanner = new Scanner(System.in);

    public RunNote() {
        this.notePad = new NotePad();
    }
    public void run () {
        while(true){
         System.out.println("1.전체보기, 2.상세보기, 3.추가하기, 4.수정하기, 5.삭제하기, 6.종료");
        int selectNum = scanner.nextInt();

        if (selectNum == 1) {
            notePad.showAll();
        } else if (selectNum == 2) {
            notePad.showEach();
        } else if (selectNum == 3) {
            notePad.addNote();
        } else if (selectNum == 4) {
            notePad.upDate();
        } else if (selectNum == 5) {

        } else if (selectNum == 6) {
            break;
        }else {
            System.out.println("다시");
        }
    }
    }
}