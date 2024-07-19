package ca.ucalgary.ensf380;

public class Category {
	private Category subCategory;
	private Category superCategory;
	private String category;
	
	public String sort() {
		return "Method sort called from Category";
	}
	
	public Category getSubCategory() {
		return this.subCategory;
	}
	
	public void setSubCategory(Category sub) {
		this.subCategory = sub; 
	}
	
	public Category getSuperCategory() {
		return this.superCategory;
	}
	
	public void setSuperCategory(Category Super) {
		this.superCategory = Super;
	}
	
	public String getCategory() {
		return this.category;
	}
	
	public void setCategory(String cat) {
		this.category = cat;
	}
}
