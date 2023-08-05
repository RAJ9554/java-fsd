import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteAadharComponent } from './delete-aadhar.component';

describe('DeleteAadharComponent', () => {
  let component: DeleteAadharComponent;
  let fixture: ComponentFixture<DeleteAadharComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeleteAadharComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DeleteAadharComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
