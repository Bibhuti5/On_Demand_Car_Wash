import React from 'react'
import { useNavigate } from 'react-router-dom';
const WasherLogin = () => {
    let navigate = useNavigate();
    return (
        <div>
            <h1 className='text-center'>WASHER LOGIN</h1>
            <div className="formDetails">
                <input type="text" placeholder='name' /><br /><br />
                <input type="password" placeholder='password' />
                <br />
                <button className="bookBtn" onClick={() => { navigate('/washerhome') }}>Submit <i className="fas fa-arrow-right rightArw"></i></button>
            </div>
        </div>
    )
}

export default WasherLogin;