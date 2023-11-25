import { Component } from '@angular/core';
import {FormControl,FormGroup} from '@angular/forms'
@Component({
  selector: 'app-new-form',
  templateUrl: './new-form.component.html',
  styleUrls: ['./new-form.component.css']
})
export class NewFormComponent {
  userForm2= new FormGroup({
    name1:new FormControl('Ranjeet'),
    email1:new FormControl('ranjeet@gmail.com'),
  });
  getForm2(){
    console.log(this.userForm2.value);
  }
}