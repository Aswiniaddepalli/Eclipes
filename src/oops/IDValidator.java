package oops;

public abstract class IDValidator {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public abstract boolean validate();

}