import React, {Component} from 'react'
import createForm from 'react-create-form'
 
class LoginForm extends Component {
  constructor(props) {
    super(props)
    this.handleSubmit = this.handleSubmit.bind(this)
  }
 
  async handleSubmit(event) {
    event.preventDefault()
    let formData = await this.props.getFormData()
    // make fetch request or dispatch redux/flux action
  }
 
  render() {
    let {onChange, form} = this.props
    return (
      <form
        autoComplete="off"
        onSubmit={this.handleSubmit}>
        <div>
          <label>Username:</label>
          <input
            type="text"
            name="username"
            value={form.username.value}
            onChange={onChange}
          />
        </div>
        <div>
          <label>Password:</label>
          <input
            type="password"
            name="password"
            value={form.password.value}
            onChange={onChange}
          />
        </div>
        <div>
          <button type="submit">Login</button>
        </div>
      </form>
    )
  }
}
 
export default createForm(LoginForm, {
  username: {value: ''},
  password: {value: ''}
})