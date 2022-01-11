
import {ReactComponent as GitHubIcon} from 'assets/img/github.svg'
import './style.css';

function NavBar(){
    return(
        <header className='header'>
        <nav className="container">
          <div className="dsmovie-nav-content">
            <h1>DSMovie</h1>
            <a href="https://github.com/emanuelzaveruka">
              <div className="dsmovie-contact-container">
                <GitHubIcon/>
                <p className="dsmovie-contact-link">/EmanuelZaveruka</p>
              </div>
            </a>
          </div> 
        </nav>
      </header>
    );
}

export default NavBar;