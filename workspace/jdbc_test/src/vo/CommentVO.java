package vo;

public class CommentVO {

	private int commentNumber;
	private String commentContent;
	private String commentRegisterDate;
	private int postNumber;
	private int memberNumber;
	
	public CommentVO() {;}

	public CommentVO(int commentNumber, String commentContent, String commentRegisterDate, int postNumber,
			int memberNumber) {
		super();
		this.commentNumber = commentNumber;
		this.commentContent = commentContent;
		this.commentRegisterDate = commentRegisterDate;
		this.postNumber = postNumber;
		this.memberNumber = memberNumber;
	}

	public int getCommentNumber() {
		return commentNumber;
	}

	public void setCommentNumber(int commentNumber) {
		this.commentNumber = commentNumber;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public String getCommentRegisterDate() {
		return commentRegisterDate;
	}

	public void setCommentRegisterDate(String commentRegisterDate) {
		this.commentRegisterDate = commentRegisterDate;
	}

	public int getPostNumber() {
		return postNumber;
	}

	public void setPostNumber(int postNumber) {
		this.postNumber = postNumber;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	@Override
	public String toString() {
		return "CommentVO [commentNumber=" + commentNumber + ", commentContent=" + commentContent
				+ ", commentRegisterDate=" + commentRegisterDate + ", postNumber=" + postNumber + ", memberNumber="
				+ memberNumber + "]";
	}
	
	
}
