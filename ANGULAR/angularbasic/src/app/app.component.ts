import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title='angularbasic';
  name:string;
    age:number;
    email: string;
    imagePath:string;

    
    constructor(){
      this.name="Sahana";
      this.age=20;
      this.email="sahanakrish.n27@gmail.com";
      this.imagePath="./assets/logo.png";

    }                                                                                   
changeName(){
  this.name="SAHA";
}

changeAge(){
  this.age=21;
}

changeEmail(){
  this.email="sahanancse2022@gmail.com"
}
changeImage(){
  this.imagePath="./assets/logo2.png"
}

}