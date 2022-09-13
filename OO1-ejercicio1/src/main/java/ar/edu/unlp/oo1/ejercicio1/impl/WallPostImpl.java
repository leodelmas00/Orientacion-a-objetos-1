package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

public class WallPostImpl implements WallPost {
	String texto = "Undefined post";
	boolean featured = false;
	int likes = 0;
	
	public String getText() {
		return texto;
	}
	
	public void setText(String text) {
		texto = text;
	}
	
	public int getLikes() {
		return likes;
	}
	public void like() {
		likes = likes + 1;
	}
	
	public void dislike() {
		if (likes != 0)
			likes = likes - 1;
	}
	
	public boolean isFeatured() {
		return featured;
	}
	
	public void toggleFeatured() {
		featured = !featured;
	}
	
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
