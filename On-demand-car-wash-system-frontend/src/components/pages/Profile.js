import React, { Component } from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import { Table } from "react-bootstrap";
import Footer from "./Footer";

export default class Profile extends Component {
  // Start
  // Constructor
  constructor(props) {
    super(props);

    this.state = {
      items: [],
      DataisLoaded: false,
    };
  }

  // ComponentDidMount is used to
  // execute the code
  componentDidMount() {
    fetch("http://localhost:8080/user/allusers")
      .then((res) => res.json())
      .then((json) => {
        this.setState({
          items: json,
          DataisLoaded: true,
        });
      });
  }

  //End

  render() {
    const { DataisLoaded, items } = this.state;

    return (
      <>
        <div>
          <Table striped bordered hover variant="dark">
            <thead>
              <tr>
                <th>Name</th>
                <th>Username</th>
                <th>Email</th>
                <th>Contact</th>
              </tr>
            </thead>
          </Table>
        </div>
        {items.map((item) => (
          <div>
            <Table striped bordered hover variant="dark">
              <tbody>
                <tr>
                  <td>{item.name}</td>
                  <td>{item.username}</td>
                  <td>{item.email}</td>
                  <td>{item.contactno}</td>
                </tr>
              </tbody>
            </Table>
          </div>
        ))}

        <div>
          <Footer />
        </div>
      </>
    );
  }
}
