


class NameForm extends React.Component {
  /*constructor(props) {
    super(props);
    this.state = {value: ''};

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }
	
  handleChange(event) {
    this.setState({value: event.target.value});
  }
*/
 /* handleSubmit(event) {
    alert('A name was submitted: ' + this.state.value);
    event.preventDefault();
  }*/

  render() {
    return (
      <form action="@{primeForm}" object="${primenumberbean}"
		method="POST">
        <label>
          Name:
          <input type="text" id="inputPrime"
			name="inputPrime" />
        </label>
        <input type="submit" value="Submit" />
      </form>
    );
  }
}

ReactDOM.render(
  <NameForm />,
  document.getElementById('mydiv')
);