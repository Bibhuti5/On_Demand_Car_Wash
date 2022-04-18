import React from 'react';
import '../../App.css';
import Footer from '../Footer';
import Admin from './Admin';
import AdminNavbar from './AdminNab';

function AdminHome() {
  return (
    <>
       <AdminNavbar />
       <Admin/>
       <Footer/>
    </>
  );
}

export default AdminHome;
