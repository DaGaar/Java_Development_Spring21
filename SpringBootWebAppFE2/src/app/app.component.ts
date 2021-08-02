import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'SpringBootWebAppFE2';

  courtYard: string = "assets/images/JavaImages/niceBuilding.jpg";
  niceBuilding: string = "assets/images/JavaImages/courtYard.jpg";
  studentGrad: string = "assets/images/JavaImages/studentGrad.jpg";

}
