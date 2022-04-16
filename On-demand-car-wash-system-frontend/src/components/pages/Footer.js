import React from 'react'
import { Container, Navbar, Col } from 'react-bootstrap';
function Footer() {
   
      
    return (
        <Navbar fixed="bottom" bg="dark" variant="dark">
          <Container >
               <Col lg={12} className="text-center text-muted">
                     <div>AutoGlow Car Wash: An on demand car wash app @2022</div>
                     
                     
               </Col>

               
          </Container>

        </Navbar>
        

    );
}


export default Footer
