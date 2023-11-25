import { Component } from '@angular/core';
import { UserService } from '../user.service';
import { Router } from '@angular/router';
import { UserDetails } from '../user-details';

@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent {
  users: UserDetails[] = [];

  constructor(private service: UserService, private router: Router) {
    this.service.getApi().subscribe(data => {
      console.log(data);
      this.users = data;
    });
  }

  ngOnInit(): void {
    this.getUser();


  }
  private getUser() {
    this.service.getUsersList().subscribe((data: UserDetails[]) => {
      this.users = data;
    });
  }

  deleteUser(id: number) {
    this.service.deleteUser(id).subscribe(data =>{
     console.log(data);
      this.getUser();
    });
}
userDetails(id:number){
  this.router.navigate(['user-detail', id]);
}

updateUser(id: number) {
  this.router.navigate(['update-user', id]);
  
}

// Add the following method to get user details by ID
getUserDetails(id: number) {
  this.service.getUserById(id).subscribe(data => {
    // Handle data as needed, e.g., navigate to update form with user details
  });
}

}