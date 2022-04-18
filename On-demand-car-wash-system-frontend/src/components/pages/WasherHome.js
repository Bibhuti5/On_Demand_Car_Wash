import React from 'react';
import '../../App.css';
import Footer from '../Footer';
import Washer from './washer';
import WasherNavbar from './WasherNav';

function WasherHome() {
  return (
    <> 
       <WasherNavbar/>
       <Washer/>
       <Footer/>
    </>
  );
}

export default WasherHome;
