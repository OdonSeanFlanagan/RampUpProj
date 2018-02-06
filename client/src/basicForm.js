import React from 'react';
 
export default class BasicForm extends React.Component {
    constructor(props) {
        super(props)
        this.value= "/";
    }

    render() {
            return (
                <form action={this.value}>
                    <div>
                        <label>Username:</label>
                        <input
                            type="text"
                            name="username"
                        />
                    </div>
                    <div>
                        <label>Password:</label>
                        <input
                            name="password"
                        />
                    </div>
                    <div>
                        <button type="submit">Login</button>
                    </div>
                </form>
    )
  }
}
