package cz.fim.uhk.cinema.form;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Program implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_program;
	
	private Date date;
	
	@OneToOne
	private Movie movie;
	
	@OneToOne
	private Hall hall;
	
	public Program(Date date, Movie movie, Hall hall) {
		super();
		this.date = date;
		this.movie = movie;
		this.hall = hall;
	}

	public int getId_program() {
		return id_program;
	}

	public void setId_program(int id_program) {
		this.id_program = id_program;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Hall getHall() {
		return hall;
	}

	public void setHall(Hall hall) {
		this.hall = hall;
	}
	
}