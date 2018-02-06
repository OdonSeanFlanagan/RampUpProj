import React, { Component } from 'react';
import BasicForm from './basicForm';
import './App.css';

class App extends Component {


    //saw this sort of setup on a tutorial
    componentDidMount() {
        fetch('/')
            .then(response => {
                console.log(response);
                response.json();
            })
            .then((proposals) => {
                console.log(proposals);
            });
        }

  render() {
    return (
    	<div>
    		<BasicForm />
            <div>
                <button type="submit" onClick={this.componentDidMount()}>Do</button>
            </div>
    	</div>
    );
  }
}

export default App;



