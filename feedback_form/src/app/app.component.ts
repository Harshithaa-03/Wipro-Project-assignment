import { Component, OnInit } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-root',
  standalone: true, // Mark as standalone
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  imports: [FormsModule] // Import FormsModule directly since it's standalone
})
export class AppComponent implements OnInit {
  model = {
    name: '',
    email: '',
    subject: '',
    comment: ''
  };
  submitted = false;

  ngOnInit() {
    console.log(this.model);
  }

  onSubmit(form: NgForm) {
    if (form.valid) {
      this.submitted = true;
      form.reset();
      this.model = { name: '', email: '', subject: '', comment: '' };
      setTimeout(() => {
        this.submitted = false;
      }, 3000);
    }
  }
}