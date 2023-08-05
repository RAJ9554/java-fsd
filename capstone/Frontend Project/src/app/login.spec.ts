import { Login } from './login';

describe('Login', () => {
  it('should create an instance', () => {
    const login = new Login('test@example.com', 'password', 'user'); // Provide sample values
    expect(login).toBeTruthy();
  });
});
