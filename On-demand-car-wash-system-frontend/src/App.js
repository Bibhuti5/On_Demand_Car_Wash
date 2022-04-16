import React from 'react';
import Navbar from './components/Navbar';

import Home from './components/pages/Home';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';


import SignUp from './components/pages/SignUp';

// import Userlog from './components/pages/Userlog';
import Login from './components/pages/Login';
import Booking from './components/pages/Booking';
import Washer from './components/pages/washer';
import WasherLog from './components/pages/Washerlog';
import Admin from './components/pages/Admin';
import Addpacks from './components/pages/addpacks';
import Services from './components/pages/Services';
import About from './components/pages/About';
import Payment from './components/pages/payment';
import Profile from './components/pages/Profile';
import Footer from './components/pages/Footer';
import AdminLog from './components/pages/AdminLog';







function App() {
  return (
    <>
      <Router>
        <Navbar />
        <Routes>
          <Route path='/'  element={<Home/>}/>
          <Route path='/services'  element={<Services/>}/>
          <Route path='/pay'  element={<Payment/>}/>
          <Route path='/signup'  element={<SignUp/>}/>
          <Route path='/Login'  element={<Login/>}/>
          <Route path='/booking'  element={<Booking/>}/>
          <Route path='/washer'  element={<Washer/>}/>
          <Route path='/washerlog'  element={<WasherLog/>}/>
          <Route path='/admin'  element={<Admin/>} />
          <Route path='/addpacks'  element={<Addpacks/>} />
          <Route path='/about'  element={<About/>}/>
          <Route path='/addpacks'  element={<Addpacks/>} />
          <Route path='/profile' element={<Profile/>}/>
          <Route path='/footer' element={<Footer/>}/>
          <Route path='/adminlog' element={<AdminLog/>}/>    
          {/* <Route path='/userlog'  element={<Userlog/>}/>      */}
        </Routes>
      </Router> 
    </>
  );
}

export default App;
