-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.6.17 - MySQL Community Server (GPL)
-- OS do Servidor:               Win32
-- HeidiSQL Versão:              9.1.0.4867
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Copiando estrutura do banco de dados para db_livraria
CREATE DATABASE IF NOT EXISTS `db_livraria` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `db_livraria`;


-- Copiando estrutura para tabela db_livraria.autor
CREATE TABLE IF NOT EXISTS `autor` (
  `id_autor` int(11) DEFAULT NULL,
  `nome_autor` int(11) DEFAULT NULL,
  `anoNascimento` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_livraria.autor: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `autor` DISABLE KEYS */;
/*!40000 ALTER TABLE `autor` ENABLE KEYS */;


-- Copiando estrutura para tabela db_livraria.categoria
CREATE TABLE IF NOT EXISTS `categoria` (
  `id_categoria` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT '0',
  PRIMARY KEY (`id_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_livraria.categoria: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;


-- Copiando estrutura para tabela db_livraria.editora
CREATE TABLE IF NOT EXISTS `editora` (
  `id_editora` int(11) NOT NULL AUTO_INCREMENT,
  `cnpj` varchar(50) DEFAULT '0',
  `nome` varchar(50) DEFAULT '0',
  PRIMARY KEY (`id_editora`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_livraria.editora: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `editora` DISABLE KEYS */;
/*!40000 ALTER TABLE `editora` ENABLE KEYS */;


-- Copiando estrutura para tabela db_livraria.endereco_usuario
CREATE TABLE IF NOT EXISTS `endereco_usuario` (
  `id_endereco` int(11) NOT NULL AUTO_INCREMENT,
  `fk_usuario` int(11) NOT NULL DEFAULT '0',
  `titulo` varchar(255) NOT NULL DEFAULT '0',
  `endereco` varchar(255) NOT NULL DEFAULT '0',
  `cep` varchar(50) NOT NULL DEFAULT '0',
  `ativo` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_endereco`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_livraria.endereco_usuario: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `endereco_usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `endereco_usuario` ENABLE KEYS */;


-- Copiando estrutura para tabela db_livraria.livros
CREATE TABLE IF NOT EXISTS `livros` (
  `id_livro` int(11) NOT NULL AUTO_INCREMENT,
  `fk_editora` int(11) NOT NULL DEFAULT '0',
  `especificacoes` text NOT NULL,
  `isbn` varchar(50) NOT NULL DEFAULT '0',
  `titulo` varchar(255) NOT NULL DEFAULT '0',
  `preco` float NOT NULL DEFAULT '0',
  `unidades` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_livro`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_livraria.livros: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `livros` DISABLE KEYS */;
/*!40000 ALTER TABLE `livros` ENABLE KEYS */;


-- Copiando estrutura para tabela db_livraria.livro_x_autor
CREATE TABLE IF NOT EXISTS `livro_x_autor` (
  `id_livro_autor` int(11) NOT NULL,
  `fk_livro` int(11) DEFAULT NULL,
  `fk_autor` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_livro_autor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_livraria.livro_x_autor: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `livro_x_autor` DISABLE KEYS */;
/*!40000 ALTER TABLE `livro_x_autor` ENABLE KEYS */;


-- Copiando estrutura para tabela db_livraria.livro_x_categoria
CREATE TABLE IF NOT EXISTS `livro_x_categoria` (
  `id_livro_x_categoria` int(11) NOT NULL,
  `fk_livro` int(11) DEFAULT NULL,
  `fk_caegoria` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_livro_x_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_livraria.livro_x_categoria: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `livro_x_categoria` DISABLE KEYS */;
/*!40000 ALTER TABLE `livro_x_categoria` ENABLE KEYS */;


-- Copiando estrutura para tabela db_livraria.usuarios
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(255) NOT NULL,
  `senha` varchar(255) NOT NULL,
  `nome_usuario` varchar(255) NOT NULL,
  `sobrenome_usuario` varchar(255) NOT NULL,
  `cpf` varchar(50) NOT NULL,
  `fk_tipo_usuario` int(11) NOT NULL DEFAULT '1',
  `data_cadastro` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ativo` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_livraria.usuarios: ~9 rows (aproximadamente)
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
REPLACE INTO `usuarios` (`id_usuario`, `login`, `senha`, `nome_usuario`, `sobrenome_usuario`, `cpf`, `fk_tipo_usuario`, `data_cadastro`, `ativo`) VALUES
	(1, 'alisson', 'alisson299409', 'Alisson Zampietro', '', '', 1, '0000-00-00 00:00:00', 1),
	(2, 'luana', '123456', 'Luana', '', '', 1, '0000-00-00 00:00:00', 1),
	(3, 'aline', 'aline', 'Aline', 'Ferreira', '', 1, '2016-06-15 18:21:39', 1),
	(6, 'zaroio', '123456', 'Lucas', 'Polaquini', '35777126866', 1, '2016-06-15 20:38:13', 1),
	(7, 'jelops', '123456', 'Jéssica', 'Lopes', '2154689858', 1, '2016-06-15 20:48:24', 1),
	(13, 'uiahs', 'iuahs', 'asuas', 'uiahs', 'auihs', 1, '2016-06-15 23:23:34', 1),
	(14, 'aoisj', 'aijs', 'asas', 'iajs', 'aiojs', 1, '2016-06-15 23:32:23', 1),
	(15, 'aiush', 'iaush', 'ash', 'asuh', 'aisuh', 1, '2016-06-15 23:39:01', 1),
	(16, 'auhs', 'aiush', 'asj', 'auuhs', 'uahs', 1, '2016-06-15 23:48:46', 1);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
