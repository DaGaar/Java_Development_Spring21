import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { StudentListComponent } from './student-list/student-list.component';
import { CourseListComponent } from './course-list/course-list.component';
import { CreateStudentComponent } from './create-student/create-student.component';
import { UpdateStudentComponent } from './update-student/update-student.component';
import { StudentDetailComponent } from './student-detail/student-detail.component';

const routes : Routes = [
  {path : 'students', component: StudentListComponent},
  {path : 'courses', component: CourseListComponent},
  {path : 'create-student', component: CreateStudentComponent },
  {path : '', redirectTo: 'students', pathMatch: 'full'},
  {path :'student-detail/:id', component: StudentDetailComponent},
  {path : 'update-student/:id', component: UpdateStudentComponent}
]

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
