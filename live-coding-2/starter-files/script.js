// API
const API_ENDPOINT = 'https://yesno.wtf/api';

/**
 * STEPS:
 *
 * 1. Create a fetchAnswer function and call the API
 * 2. Output the API's response
 * 3. Attach fetchAnswer to an event listener
 * 4. Clear output after 3 seconds
 * 5. Optional: add loading/error states
 *
 */


const answer = document.getElementById('answer');
const input = document.getElementById('input');
const errores = document.getElementById('error');
const bola = document.getElementById('ball');

async function apiResponse() 
{
    try {
        if (input.value === '') 
        {
            setTimeout((errores.textContent = 'Por favor ingrese una pregunta'), 5000);
        } else 
        {
            const response = await fetch(API_ENDPOINT);
            const data = await response.json();
            bola.classList.add('shake__ball');
            answer.textContent = data.answer;
            setTimeout(() => 
            {
                bola.classList.remove('shake__ball');
                answer.textContent = '';
                input.value = '';
            }, 5000);
        }
    } catch (err) 
    {
        errores.textContent = err.message;
    }
}

const button = document.getElementById('button');
button.addEventListener('click', apiResponse);