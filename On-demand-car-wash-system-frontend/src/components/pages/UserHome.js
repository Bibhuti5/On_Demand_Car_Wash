import React from 'react';
import '../../App.css';
import Footer from '../Footer';
import Admin from './Admin';
import AdminNavbar from './AdminNab';
import UserNavbar from './UserNavbar';

function UserHome() {
  return (
    <>
       <UserNavbar/>
    
       <Footer/>
    </>
  );
}

export default UserHome;
