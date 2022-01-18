import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserServiceService } from '../user-service.service';
import { User } from '../user';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent {
  user!: User;
  constructor(
    private route: ActivatedRoute,
      private router: Router,
        private UserService: UserServiceService) {
    this.user = new User();
   }
   onSubmit() {
     /* redirects after submit */
     this.UserService.save(this.user).subscribe(result => this.goToUserList());
   }
   goToUserList() {
     this.router.navigate(["/users"]);
   }

  

}
