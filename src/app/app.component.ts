import { Component } from '@angular/core';
import { UserService } from './user.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {


  title = 'NewProject';

 

  // constructor(private service:UserService){
  //   this.service.getApi().subscribe(data=> {
  //     console.log(data);
  //     this.users = data;
  //   });
  // }


  // constructor(private service: UserService, private router: Router) {
  //   this.service.getApi().subscribe(data => {
  //     console.log(data);
  //     this.users = data;
  //   });
  // }

  // navigateTo(route: string) {
  //   this.router.navigate([route]);
  // }
  getForm(data: any) {
    console.log(data);

  }
}
