import React from 'react'
import { useNavigate } from 'react-router-dom';
const AdminLog = () => {
    let navigate = useNavigate();
    return (
        <div>
            <h1 className='text-center'>Admin LOGIN</h1>
            <div className="formDetails">
                <input type="text" placeholder='name' /><br /><br />
                <input type="password" placeholder='password' />
                <br />
                <button className="bookBtn" onClick={() => { navigate('/admin_home') }}>Submit <i className="fas fa-arrow-right rightArw"></i></button>
            </div>
        </div>
    )
}

export default AdminLog;