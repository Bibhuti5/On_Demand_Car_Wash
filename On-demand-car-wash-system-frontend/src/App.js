import React from "react";
import Navbar from "./components/Navbar";
import "./Style.css";

import Home from "./components/pages/Home";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";

import SignUp from "./components/pages/SignUp";

// import Userlog from './components/pages/Userlog';
import Login from "./components/pages/Login";
import Booking from "./components/pages/Booking";
import Washer from "./components/pages/washer";
import WasherLog from "./components/pages/Washerlog";
import Admin from "./components/pages/Admin";
import Addpacks from "./components/pages/addpacks";
import Services from "./components/pages/Services";
import About from "./components/pages/About";
import Payment from "./components/pages/payment";
import Profile from "./components/pages/Profile";
import Footer from "./components/pages/Footer";
import AdminLog from "./components/pages/AdminLog";
import AdminHome from "./components/pages/AdminPage";
import AdminNavbar from "./components/pages/AdminNab";
import WasherHome from "./components/pages/WasherHome";
import WasherNavbar from "./components/pages/WasherNav";
import UserHome from "./components/pages/UserHome";
import UserNavbar from "./components/pages/UserNavbar";
import WasherProfile from "./components/pages/WasherProfile";

import UserLogin from "./components/UserLogin";
import UserSign from "./components/UserSign";

function App() {
  return (
    <>
      <Router>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/services" element={<Services />} />
          <Route path="/pay" element={<Payment />} />
          <Route path="/Userlogin" element={<UserLogin />} />
          <Route path="/Usersign" element={<UserSign />} />
          {/* 
           -> User Controls Only
          */}
          <Route path="/Userhome" element={<UserHome />} />
          <Route path="/Usernav" element={<UserNavbar />} />
          <Route path="/signup" element={<SignUp />} />
          <Route path="/Login" element={<Login />} />
          <Route path="/booking" element={<Booking />} />
          <Route path="/addpacks" element={<Addpacks />} />
          <Route path="/about" element={<About />} />
          <Route path="/profile" element={<Profile />} />
          <Route path="/footer" element={<Footer />} />
          {/* 
          * Waasher Controls Only
          
          */}
          <Route path="/WasherProfile" element={<WasherProfile />} />
          <Route path="/washerhome" element={<WasherHome />} />
          <Route path="/washer" element={<Washer />} />
          <Route path="/washerlog" element={<WasherLog />} />
          <Route path="/washerNav" element={<WasherNavbar />} />

          {/* 
            For Admin Control only
          */}
          <Route path="/admin" element={<Admin />} />
          <Route path="/adminlog" element={<AdminLog />} />
          <Route path="/admin_home" element={<AdminHome />} />
          <Route path="/admin_nav" element={<AdminNavbar />} />
        </Routes>
      </Router>
      <Router></Router>
    </>
  );
}

export default App;
