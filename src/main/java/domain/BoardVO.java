package domain;

import java.sql.Date;

public class BoardVO {
    private int BoardId;
    private String BoardTitle;
    private String BoardWriter;
    private String BoardContent;
    private Date BoardDate;
    private int BoardCnt; //조회수

    public int getBoardId() {
        return BoardId;
    }

    public void setBoardId(int boardId) {
        BoardId = boardId;
    }

    public String getBoardTitle() {
        return BoardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        BoardTitle = boardTitle;
    }

    public String getBoardWriter() {
        return BoardWriter;
    }

    public void setBoardWriter(String boardWriter) {
        BoardWriter = boardWriter;
    }

    public String getBoardContent() {
        return BoardContent;
    }

    public void setBoardContent(String boardContent) {
        BoardContent = boardContent;
    }

    public Date getBoardDate() {
        return BoardDate;
    }

    public void setBoardDate(Date boardDate) {
        BoardDate = boardDate;
    }

    public int getBoardCnt() {
        return BoardCnt;
    }

    public void setBoardCnt(int boardCnt) {
        BoardCnt = boardCnt;
    }

    @Override
    public String toString() {
        return "BoardVO{" +
                "BoardId=" + BoardId +
                ", BoardTitle='" + BoardTitle + '\'' +
                ", BoardWriter='" + BoardWriter + '\'' +
                ", BoardContent='" + BoardContent + '\'' +
                ", BoardDate=" + BoardDate +
                ", BoardCnt=" + BoardCnt +
                '}';
    }
}
