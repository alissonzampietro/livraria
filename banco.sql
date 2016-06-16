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
  `fk_tipo_usuario` int(11) NOT NULL DEFAULT '1',
  `login` varchar(255) NOT NULL,
  `senha` varchar(255) NOT NULL,
  `nome_usuario` varchar(255) NOT NULL,
  `sobrenome_usuario` varchar(255) NOT NULL,
  `cpf` varchar(50) NOT NULL,
  `data_cadastro` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ativo` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_livraria.usuarios: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
REPLACE INTO `usuarios` (`id_usuario`, `fk_tipo_usuario`, `login`, `senha`, `nome_usuario`, `sobrenome_usuario`, `cpf`, `data_cadastro`, `ativo`) VALUES
	(1, 1, 'alisson', 'alisson299409', 'Alisson Zampietro', '', '', '0000-00-00 00:00:00', 1),
	(2, 1, 'luana', '123456', 'Luana', '', '', '0000-00-00 00:00:00', 1),
	(3, 1, 'aline', 'aline', 'Aline', 'Ferreira', '', '2016-06-15 18:21:39', 1),
	(6, 1, 'zaroio', '123456', 'Lucas', 'Polaquini', '35777126866', '2016-06-15 20:38:13', 1),
	(7, 1, 'jelops', '123456', 'Jéssica', 'Lopes', '2154689858', '2016-06-15 20:48:24', 1);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
