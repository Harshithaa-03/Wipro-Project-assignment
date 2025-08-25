import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  filterType: 'artist' | 'album' = 'artist';
  searchText: string = '';

  songs = [
    { title: 'Shape of You', artist: 'Ed Sheeran', album: 'Divide', duration: '3:53', rating: 4.9 },
    { title: 'Blinding Lights', artist: 'The Weeknd', album: 'After Hours', duration: '3:20', rating: 4.8 },
    { title: 'Numb', artist: 'Linkin Park', album: 'Meteora', duration: '3:05', rating: 4.7 },
    { title: 'Unravel', artist: 'TK from Ling Tosite Sigure', album: 'Tokyo Ghoul OST', duration: '4:05', rating: 4.6 },
    { title: 'My Heart Will Go On', artist: 'Celine Dion', album: 'Titanic', duration: '4:40', rating: 4.5 },
    { title: 'Believer', artist: 'Imagine Dragons', album: 'Evolve', duration: '3:24', rating: 4.3 }
  ];

  filteredSongs() {
    const filter = this.searchText.toLowerCase();
    return this.songs.filter(song => {
      const field = song[this.filterType];
      return typeof field === 'string' && field.toLowerCase().includes(filter);
    });
  }
}



