# sql script

CREATE DATABASE hastega_library
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;

\c hastega_library

CREATE TABLE IF NOT EXISTS public.account (
  id serial PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  surname VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS public.book (
  id serial PRIMARY KEY,
  title VARCHAR(100) NOT NULL,
  author VARCHAR(100) NOT NULL,
  isbn VARCHAR(20) NOT NULL,
  plot text
);

CREATE TABLE IF NOT EXISTS public.account_book (
    id serial PRIMARY KEY,
    account_id INTEGER NOT NULL,
    book_id INTEGER NOT NULL,
    date_added TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    date_removed DATE,
    times_read INTEGER DEFAULT 0,
    FOREIGN KEY (account_id) REFERENCES account(id),
    FOREIGN KEY (book_id) REFERENCES book(id)
);

INSERT INTO account (name, surname, email)
VALUES
  ('Matteo', 'Bianchi', 'matteo.bianchi@email.com'),
  ('Sara', 'Rizzo', 'sara.rizzo@email.com'),
  ('Alessio', 'Ferrari', 'alessio.ferrari@email.com'),
  ('Chiara', 'Moretti', 'chiara.moretti@email.com'),
  ('Andrea', 'Galli', 'andrea.galli@email.com');

INSERT INTO book (title, author, isbn, plot)
VALUES
  ('La scienza delle verdure', 'Dario Bressanini', '8858025199', 'Dario Bressanini svela i principi chimici e fisici alla base delle verdure più utilizzate in cucina.'),
  ('La coscienza di Zeno', 'Italo Svevo', '8807900491', 'uno dei capolavori della letteratura europea del Novecento, è la tragicomica vicenda di un "inetto a vivere"'),
  ('Gomorra', 'Roberto Saviano', '3456789012345', 'Il libro è un viaggio nel mondo affaristico e criminale della camorra e dei luoghi dove questa è nata e vive: la Campania, Napoli, Casal di Principe'),
  ('I Malavoglia', 'Giovanni Verga', '4567890123456', 'Il romanzo è ambientato in un piccolo villaggio di pescatori in Sicilia e segue le vite di una famiglia di pescatori, i Malavoglia, che affrontano difficoltà economiche e personali.'),
  ('I gioielli di famiglia', 'Adriana Trigiani', '5678901234567', 'Il tramonto degli anni Settanta, la musica e la politica, la repressione e la lotta armata, le controculture');

INSERT INTO account_book (account_id, book_id, times_read)
VALUES
  (1, 1, 3),
  (1, 2, 4),
  (1, 3, 1),
  (1, 4, 2),
  (2, 3, 5),
  (2, 4, 1),
  (3, 5, 2),
  (3, 1, 7),
  (4, 2, 5),
  (4, 3, 3),
  (5, 4, 2),
  (5, 5, 1);