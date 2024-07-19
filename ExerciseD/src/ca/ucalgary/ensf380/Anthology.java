package ca.ucalgary.ensf380;

class Anthology extends Fiction {
	private Story[] stories;
	
	public String storyOrder() {
		return "Method storyOrder called from Anthology";
	}
	
	public Story[] getStory() {
		return this.stories;
	}
	
	public void setStory(Story[] stories) {
		this.stories = stories;
	}
	
	public String coverArt() {
		return "Method coverArt called from Anthology";
	}
}
