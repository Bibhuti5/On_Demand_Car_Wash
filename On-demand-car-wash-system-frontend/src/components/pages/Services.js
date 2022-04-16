import React, { useState, useEffect } from 'react';
import './services.css'
import { useNavigate } from 'react-router-dom'
import Footer from './Footer';


const Services = () => {

  // start 
  const [washers, setWashers] = useState([])



  useEffect(() => {
    fetch("http://localhost:9991/admin/allpacks").then(result => {
      result.json().then(
        resp => {
          setWashers(resp)
          console.log(resp)
        })
    })
  }, [])


  //End
  let navigate = useNavigate();


  return (
    <>
      <div className='title'>
        <h1>Affordable Pricing For Everyone..</h1>
        <div>
          <h3 className='sub'>Book Your Wash Today.....!</h3>
          <div class="line-2"></div>
          {washers.map((emp, ind) => (<div >
            {/*
            * Plane  Fromate
            * You Can add all the planes accordingly             
            */}
            <div class='flip-card'>
              <div className='flip-card-inner'>
                <div class='flip-card-front'>
                  <h2> {emp.packname}</h2>
                  <h1 className='mo'>Rs.{emp.cost}</h1>
                </div>
                <div class='flip-card-back'>
                  <h3>{emp.description}</h3>
                  <button className="pack" onClick={() => { navigate('/Booking') }}>Book Now </button></div>
              </div>
            </div>
          </div>))}
        </div>
      </div>
      <div>
        <Footer />
      </div>


    </>

  );
}
export default Services