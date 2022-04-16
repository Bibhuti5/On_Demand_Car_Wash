import React from 'react';
import './Footer.css';
import { Link } from 'react-router-dom';


function Footer() {
  return (
   

      <div className='footer-container' id='about'>
        <section className='footer-subscription'>
          <p className='footer-subscription-heading'>

            For You Excellence is our best habit. We wash cars with modern Detailing Technology
          </p>


        </section>
        <div class='footer-links'>
          <div className='footer-link-wrapper'>
            <div class='footer-link-items'>
              <h2>About Us</h2>

              <Link to='/'>Making cars clean, shiny and glossy is our main specialty! On par with dedicated and thorough exterior and interior washing services, we also offer such detailing help as interior vacuuming, polishing, waxing and many others...</Link>

            </div>

          </div>




          <div class='footer-link-items'>
            
            <h2>NEED HELP ?</h2>
            <Link to='/'>WE ARE HERE TO HELP YOU</Link>


          </div>


          <div class='footer-link-items' id='Contact'>
            <h2>Contact Us</h2>
            <Link to='/'>We are open,</Link>
            <Link to='/'> Mon-sat 09:00 am - 09:00 pm</Link>
            <Link to='/'>Contact
              (+91) 9100406677</Link>
              
            <Link to='/'>We're HERE
              Near metro station lbnagar, Door no:10 , Hyderabad - 500070</Link>

          </div>

        </div>
        <section class='social-media'>
          <div class='social-media-wrap'>
            <div class='footer-logo'>
              <Link to='/' className='social-logo'>
                 CarWash-Centre
                {/* <i class="fab fa-swift"></i> */}
              </Link>
            </div>
            <small class='website-rights'> </small>
            <div class='social-icons'>
              <Link
                class='social-icon-link facebook'
                to='/'
                target='_blank'
                aria-label='Facebook'
              >
                <i class='fab fa-facebook-f' />
              </Link>
              <Link
                class='social-icon-link instagram'
                to='/'
                target='_blank'
                aria-label='Instagram'
              >
                <i class='fab fa-instagram' />
              </Link>
              <Link
                class='social-icon-link youtube'
                to='/'
                target='_blank'
                aria-label='Youtube'
              >
                <i class='fab fa-youtube' />
              </Link>
              <Link
                class='social-icon-link twitter'
                to='/'
                target='_blank'
                aria-label='Twitter'
              >
                <i class='fab fa-twitter' />
              </Link>
            
            </div>
          </div>
        </section>
      </div>
   
  );
}

export default Footer;
