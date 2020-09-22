package web.dto;

public class Recommend {
	private String id;
	private int boardNo;
	
	@Override
	public String toString() {
		return "Recommend [id=" + id + ", boardNo=" + boardNo + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	
	
}
