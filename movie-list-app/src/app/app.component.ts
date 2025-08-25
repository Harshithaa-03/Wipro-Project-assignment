
import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatCardModule } from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';
import { MatSelectModule } from '@angular/material/select';
import { MatFormFieldModule } from '@angular/material/form-field';

interface Movie {
  title: string;
  poster: string;
  genre: string;
  rating: number;
  description: string;
}

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    CommonModule,
    MatToolbarModule,
    MatCardModule,
    MatIconModule,
    MatSelectModule,
    MatFormFieldModule
  ],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  genres = ['All', 'Action', 'Drama', 'Comedy', 'Horror'];
  selectedGenre = 'All';

  movies: Movie[] = [
    {
      title: 'Inception',
      poster: './Inception.jpg',
      genre: 'Action',
      rating: 4,
      description: 'A mind-bending thriller by Christopher Nolan.'
    },
    {
      title: 'Sita Ramam',
      poster: './Sita-Ramam.webp',
      genre: 'Drama',
      rating: 5,
      description: 'An Love story between solider and princess.'
    },
    {
      title: 'Su from So',
      poster: './Su from So.avif',
      genre: 'Comedy',
      rating: 3,
      description: 'A Horror-Comedy movie with young man.'
    },
    {
      title: 'Aatma',
      poster: './Aatma.jpg',
      genre: 'Horror',
      rating: 3.5,
      description: 'Terrifying supernatural family horror.'
    },
    {
      title: 'Kirik Party',
      poster: './kirik party.avif',
      genre: 'Comedy & Love',
      rating: 4.5,
      description: 'College Campus,Friends and Love Story.'
    }
  ];

  get filteredMovies(): Movie[] {
    return this.selectedGenre === 'All'
      ? this.movies
      : this.movies.filter(movie => movie.genre === this.selectedGenre);
  }

  get averageRating(): number {
    const total = this.filteredMovies.reduce((sum, m) => sum + m.rating, 0);
    return this.filteredMovies.length ? total / this.filteredMovies.length : 0;
  }

  isTopRated(movie: Movie): boolean {
    return movie.rating === 5;
  }
}
