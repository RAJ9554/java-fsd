import { User } from './user';

describe('User', () => {
  it('should create an instance', () => {
    // Provide valid username and password for the User constructor
    const username = 'exampleUser';
    const password = 'examplePassword';
    expect(new User(username, password)).toBeTruthy();
  });
});
