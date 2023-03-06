package notebook;
import  java.util.Scanner;

public class NotePad {
    private int noteLength = 0;
    private NoteEntity[] noteEntities;
    private int NOTE_SIZE = 20;
    private String choiceNum = "번호를 선택해주세요";
    Scanner scanner = new Scanner(System.in);
    private int password = 0000;

    public NotePad() {
        this.noteEntities = new NoteEntity[NOTE_SIZE];
    }

    public void addNote(){

        if(NOTE_SIZE == noteLength){
            System.out.println("노트가 꽉 찼습니다.");
            return;
        }
        System.out.println("제목을 입력해 주세요");
        String addTitle = scanner.nextLine();
        System.out.println("내용을 입력해 주세요");
        String addContent = scanner.nextLine();
        noteEntities[this.noteLength++] = NoteEntity.newInstance(addTitle, addContent);
        System.out.println("메모 작성 완료");
    }

    public void showAll() {
        if (0 == this.noteLength) {
            System.out.println("작성된 메모가 없습니다");
        }
        for (int i = 0; i < this.noteLength; i++) {
            NoteEntity noteEntity = noteEntities[i];
            String headLine = String.format("번호 :  %d, 제목 : %s, 날짜 : %s", i, noteEntity.getTitle(), noteEntity.getLastUpdatedDateTime());
            System.out.println(headLine);
        }
    }
    public void showEach() {
        System.out.println(this.choiceNum);
        int selectedNum = scanner.nextInt();
        NoteEntity noteEntity = this.noteEntities[selectedNum];
        String show = String.format("제목 : %s, 내용 : %s, 날짜 : %s", noteEntity.getTitle(),noteEntity.getContent(),noteEntity.getLastUpdatedDateTime());
        System.out.println(show);
    }

    public void upDate() {
        System.out.println(this.choiceNum);
        int selectedNum = scanner.nextInt();
        System.out.println("수정할 내용을 입력해주세요");
        scanner.nextLine();
        String content = scanner.nextLine();
        NoteEntity noteEntity = noteEntities[selectedNum];
        noteEntity.update(content);
        System.out.println("수정 완료했습니다");
    }

    public void delete() {
        System.out.println(this.choiceNum);
        int selectedNum = scanner.nextInt();
        System.out.println("정말 삭제 하시겠습니까? YES: 0, NO: 1");
        int realDelete = scanner.nextInt();
        if (realDelete == 0){
            System.out.println("비밀 번호를 입력해 주세요");
            int inputNum = scanner.nextInt();
            if (inputNum == password){
                NoteEntity noteEntity = noteEntities[noteLength - -1];
                
            }
        }
    }
}