package notebook;
import java.time.LocalDateTime;
public class NoteEntity {
    private String title;
    private String content;
    private LocalDateTime lastUpdatedDateTime;

    private NoteEntity(String title, String content){
        this.title = title;
        this.content = content;
        this.lastUpdatedDateTime = LocalDateTime.now();
    }
    static NoteEntity newInstance(String title, String content){
            return new NoteEntity(title, content);  //인스턴스 생성, 위 코드가 프리베잇으로 작성 되어있어 외부에 적용 x-> 받아서 할당
    }

    void update(String content){
        this.content    = content;
        this.lastUpdatedDateTime = LocalDateTime.now();
    }

    String getTitle(){
        return title;
    }

    String getContent(){
        return content;
    }

    String getLastUpdatedDateTime(){
        return lastUpdatedDateTime.toString();
    }
}
