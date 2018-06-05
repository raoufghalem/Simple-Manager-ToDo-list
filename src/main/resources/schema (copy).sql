-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le :  jeu. 31 mai 2018 à 02:34
-- Version du serveur :  10.1.32-MariaDB
-- Version de PHP :  7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `MyLearningCurse`
--

-- --------------------------------------------------------

--
-- Structure de la table `comment`
--

CREATE TABLE `comment` (
  `id` bigint(20) NOT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `single_resource_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `labels`
--

CREATE TABLE `labels` (
  `id` bigint(20) NOT NULL, 
  `label_name` varchar(255) DEFAULT NULL,
  `label_color` varchar(255) DEFAULT NULL,
  `list_of_resources_id` bigint(20) DEFAULT NULL,
  `single_resource_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `list_of_resources`
--

CREATE TABLE `list_of_resources` (
  `id` bigint(20) NOT NULL,
  `list_name` varchar(255) DEFAULT NULL,
  `list_number_of_resources` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `list_of_resources_list_of_labels`
--

CREATE TABLE `list_of_resources_list_of_labels` (
  `list_of_resources_id` bigint(20) NOT NULL,
  `list_of_labels_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `single_resource`
--

CREATE TABLE `single_resource` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `list_ofresource_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `single_resource_list_of_labels`
--

CREATE TABLE `single_resource_list_of_labels` (
  `single_resource_id` bigint(20) NOT NULL,
  `list_of_labels_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `single_resource_options`
--

CREATE TABLE `single_resource_options` (
  `id` bigint(20) NOT NULL,
  `option_name` varchar(255) DEFAULT NULL,
  `option_value1` varchar(255) DEFAULT NULL,
  `option_value2` varchar(255) DEFAULT NULL,
  `option_value3` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK7blccon1nppcnood8aprtqyfh` (`single_resource_id`);

--
-- Index pour la table `labels`
--
ALTER TABLE `labels`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKpvlibrr91ydr548fn7xekjmyb` (`list_of_resources_id`),
  ADD KEY `FK51i7voyp1l1k31cxx8x6bwidf` (`single_resource_id`);

--
-- Index pour la table `list_of_resources`
--
ALTER TABLE `list_of_resources`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `list_of_resources_list_of_labels`
--
ALTER TABLE `list_of_resources_list_of_labels`
  ADD UNIQUE KEY `UK_6okhfvn14ipgq0gmjt0iwdjqs` (`list_of_labels_id`),
  ADD KEY `FKmpa5x6lw0s6ur8fdovlm7twd2` (`list_of_resources_id`);

--
-- Index pour la table `single_resource`
--
ALTER TABLE `single_resource`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKo4f2urptqqxq3753xqi6e0fp9` (`list_ofresource_id`);

--
-- Index pour la table `single_resource_list_of_labels`
--
ALTER TABLE `single_resource_list_of_labels`
  ADD UNIQUE KEY `UK_xxulwd2tvq0ng8nssfxi3n0e` (`list_of_labels_id`),
  ADD KEY `FK1yi6t3xfqchfx2bcmufftm38p` (`single_resource_id`);

--
-- Index pour la table `single_resource_options`
--
ALTER TABLE `single_resource_options`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `comment`
--
ALTER TABLE `comment`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `labels`
--
ALTER TABLE `labels`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `list_of_resources`
--
ALTER TABLE `list_of_resources`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `single_resource`
--
ALTER TABLE `single_resource`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `single_resource_options`
--
ALTER TABLE `single_resource_options`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
