package vo;

public class PostVO {
	
	private int postNumber;
	private String postTitle;
	private String postContent;
	private int postViews;
	private String postRegisterDate;
	private int memberNumber;
	
	public PostVO() {;}

	public PostVO(int postNumber, String postTitle, String postContent, int postViews, String postRegisterDate,
			int memberNumber) {
		super();
		this.postNumber = postNumber;
		this.postTitle = postTitle;
		this.postContent = postContent;
		this.postViews = postViews;
		this.postRegisterDate = postRegisterDate;
		this.memberNumber = memberNumber;
	}

	public int getPostNumber() {
		return postNumber;
	}

	public void setPostNumber(int postNumber) {
		this.postNumber = postNumber;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public int getPostViews() {
		return postViews;
	}

	public void setPostViews(int postViews) {
		this.postViews = postViews;
	}

	public String getPostRegisterDate() {
		return postRegisterDate;
	}

	public void setPostRegisterDate(String postRegisterDate) {
		this.postRegisterDate = postRegisterDate;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	@Override
	public String toString() {
		return "PostVO [postNumber=" + postNumber + ", postTitle=" + postTitle + ", postContent=" + postContent
				+ ", postViews=" + postViews + ", postRegisterDate=" + postRegisterDate + ", memberNumber="
				+ memberNumber + "]";
	}
	
	
	
	
	
	
	
}
