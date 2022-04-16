import React from 'react';
import './About.css';
import Footer from '../Footer';



const About = () => {
  return (
    <div>
      <div className='aboutus'>
        <h1>ABOUT US</h1><br></br>
        <p>AutoGlow Car Wash is unique in that we are a “Flex” service car wash. What that means to you is that we are the only car wash you will ever need. At AutoGlow, our approach combines the latest car wash technology with the human touch to provide the best car wash experience possible.
          We believe in making customer satisfaction a top priority. We are vehicle owners just like you and we understand that it can be a stressful experience to trust your vehicle with someone else. At AutoGlow, you can rest assured that we will treat your vehicle as if it was our own. We wash one vehicle at a time, so we can make sure each vehicle receives the best treatment possible.</p>
      </div>
      
      <div className='aboutus'>
        <h3>WHO WE ARE</h3>
        <p> AutoGlow Car Wash is a brand which is literally going to change the way people think about car cleaning. It is a unique mechanized car cleaning concept where cars are getting pampered by the latest equipments including high pressure cleaning machines, spray injection and extraction machines, high powered vacuum cleaners, steam cleaners and so on.
        </p>
        <p>
          In this fast moving life today we tend to spend more time in travelling as a result spend hours in the car, navigating the traffic jams. Air Pollution, Dust, Rain, Sunlight and Adverse road conditions all keeps adding on woos of common car users. And as a result, there is a severe need of Professional Car Cleaning Organization to take care of all Car Cleaning jobs and give us the finest and ultimate car cleaning experience and satisfaction.</p>
        <p> AutoGlow Car Wash is here to stay and work dedicatedly towards spreading the awareness among car users about their car hygiene habits, cleanliness, durability of exterior look and other common cleaning tips.</p>

      </div>
      <Footer />
    </div>
    



  );
};

export default About;