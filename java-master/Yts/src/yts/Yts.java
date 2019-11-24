 package yts;

import java.util.List;

class Movie{
	String title;
	int year;
	double rating;
	String synopsis;
	String medium_cover_image;
}

class Data{
	int movie_count;
	int limit;
	int page_number;
	List<Movie>movies;
	
}
 
public class Yts {
	String status;
	String status_message;
	Data data;
}
